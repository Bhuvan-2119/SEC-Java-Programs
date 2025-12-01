class Student{
    int id;
    String name;
    Student(){
        id=007;
        name="Bhuvan";
    }
    void display(){
        System.out.println(id+" "+name);
    }
    public static void main(String[]args){
        Student s=new Student();
        s.display();
    }
}
