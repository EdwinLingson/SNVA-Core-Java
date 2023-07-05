package coreJava12;

public class StopWatch {
    long startTime;
    long endTime;
    void start(){
        startTime= System.nanoTime();

    }
    void end(){
        endTime= System.nanoTime();
    }
    long timeTaken(){
        return  endTime-startTime;
    }
}
