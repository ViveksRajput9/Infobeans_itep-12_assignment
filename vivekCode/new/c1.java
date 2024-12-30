class Defau {
    int id;
    String name;
    void setId(int id){
        this.id=id;
    }
    int getId(){
        return id;
        
    }
    
}

class Stud {
    public static void main(String[] args) {
        Defau d1=new Defau();
        d1.setId(101);
        d1.getId();
    }

    
}