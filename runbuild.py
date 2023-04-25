# simple build script
import os
err = 0
classpath = "-classpath \"./jackson-annotations-2.15.0.jar;./jackson-core-2.15.0.jar;./jackson-databind-2.15.0.jar;./food;./goals;./commands;./workouts;\""
try:
    # build main
    cmd = "javac " + classpath + " -d ./ ./*.java"
    err = os.system(cmd)

    # build food
    if err == 0:
        cmd = "javac " + classpath + " -d ./food ./food/*.java"
        err = os.system(cmd)

    # build commands
    if err == 0:
        cmd = "javac " + classpath + " -d ./commands ./commands/*.java"
        err = os.system(cmd)

    # build workouts
    if err == 0:
        cmd = "javac " + classpath +" -d ./workouts ./workouts/*.java"
        err = os.system(cmd)

    # run the build
    if err == 0:
        cmd = "java " + classpath + " main"
        os.system(cmd)
    
except KeyboardInterrupt:
    exit()

exit()