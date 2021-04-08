package com.testing_Thead;

public class Myclass {
    private Long id;
    private String name;

    public Myclass(Long id,String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o){
        Myclass other = (Myclass)o;
        return id.equals(other.id ) && name.equals(other.name);
    }

    @Override
    public int hashCode(){
        return id.intValue();
    }

}
