package parameters;

public class Employee {
    private final String name;
    private final String pos;
    private final long phoneNumber;


    //Abstraction function:
    //AF(name)=员工名字
    //AF(pos)=员工职位
    //AF(phoneNumber)=员工电话号码
    //Representation invariant:
    //name不为空
    //Safety from rep exposure:
    //将name,pos,phoneNumber设为private final，并且是immutable的
    public Employee(String name, String pos, long phoneNumber) {
        this.name = name;
        this.pos = pos;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPos() {
        return pos;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Employee){
            Employee e = (Employee) obj;
            return name.equals(e.name) && pos.equals(e.pos) && phoneNumber == e.phoneNumber;
        }
        return false;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[Employee:");
        sb.append(name);
        sb.append(",Position:");
        sb.append(pos);
        sb.append(",PhoneNumber:");
        sb.append(phoneNumber);
        sb.append("]");
        return sb.toString();
    }
}
