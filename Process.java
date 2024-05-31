package parameters;

public class Process {
    private final int pid;
    private final String name;
    private final long minTime;
    private final long maxTime;

    public Process(int pid, String name, long minTime, long maxTime) {
        this.pid = pid;
        this.name = name;
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    // Abstraction function:
    // AF(pid) = 进程的id
    // AF(name) = 进程的名字
    // AF(minTime) = 进程的最短运行时间
    // AF(maxTime) = 进程的最长运行时间


    public int getPid() {
        return pid;
    }

   

    public long getMinTime() {
        return minTime;
    }



    @Override
    public boolean equals(Object obj){
        if(obj instanceof Process){
            Process p = (Process) obj;
            return this.pid == p.pid && this.name.equals(p.name) && this.minTime == p.minTime && this.maxTime == p.maxTime;
        }
        return false;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[Process ");
        sb.append(pid + ":");
        sb.append(name);
        sb.append(",minTime:");
        sb.append(minTime);
        sb.append(",maxTime:");
        sb.append(maxTime);
        sb.append("]");
        return sb.toString();
    }
}
