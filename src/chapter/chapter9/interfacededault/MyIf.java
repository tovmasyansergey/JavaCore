package chapter.chapter9.interfacededault;

public interface MyIf {
    int getNumber();
    default String getString(){
        return "object of tipe String default";
    }

    }
