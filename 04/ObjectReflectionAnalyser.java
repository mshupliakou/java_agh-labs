import java.lang.reflect.Method;

public class ObjectReflectionAnalyser{
    ObjectReflectionAnalyser(){
    }
    public static void analyzeObject(Object o){
        System.out.println("Analyzing object: "+o);
        System.out.println("Class name: "+o.getClass());
        Class<?> clazz = o.getClass();
        System.out.println("Superclass: "+clazz.getSuperclass().getName());
        System.out.println("Is an interface: "+clazz.isInterface());
        System.out.println(" Available methods:");
        boolean is_cloneable=false;
        boolean is_comparable=false;
        for (Method method : clazz.getDeclaredMethods()) {
            if(method.getName().equals("clone")){
                is_cloneable=true;
            }
            if(method.getName().equals("equals"))
                is_comparable=true;
            System.out.println(" - " + method.getName());
        }
        if(o.getClass()== TextEntity.class){
            System.out.println("Is it a TextEntity?: true");
        }
        else{
            System.out.println("Is it a TextEntity?: false");
        }
        if(o.getClass()== String.class){
            System.out.println("Is it a String?: true");
        }
        else{
            System.out.println("Is it a String?: false");
        }
        if(is_cloneable){
            System.out.println("Is it Cloneable?: true");
        }
        else
            System.out.println("Is it Cloneable?: false");
        if(is_comparable){
            System.out.println("Is it Comparable?: true");
        }
        else
            System.out.println("Is it Comparable?: false");
    }
}