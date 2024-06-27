#!/usr/bin/fish

function build_program
    set files $(find src/ -iname '*.java')
    echo "building: $files"
    javac -d bin $files
end

argparse b/build r/run R/buildrun -- $argv

if set -ql _flag_build
    build_program
end

if set -ql _flag_run
    java -classpath bin Main
end

if set -ql _flag_buildrun
    build_program
    java -classpath bin Main
end