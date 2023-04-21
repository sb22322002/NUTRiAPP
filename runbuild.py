# simple build script
import os
err = 0
try:
    # build commands
    cmd = "javac -d ./commands ./commands/*.java"
    err = os.system(cmd)

    # build food
    if err == 0:
        cmd = "javac -d ./food ./food/*.java"
    err = os.system(cmd)

    # build main
    if err == 0:
        cmd = "javac -classpath \"./commands;./food;\" -d ./ ./*.java"
        err = os.system(cmd)

    # run the build
    if err == 0:
        cmd = "java -classpath \"./commands;./food;\" main"
        os.system(cmd)
    
except KeyboardInterrupt:
    exit()

exit()