import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> animali = createSet();
        System.out.println(animali);
        String animale = "leopardo";

        if(animali.contains(animale)){
            System.out.println("L'animale " + animale + " è presente nel set.");
        } else {
            System.out.println("L'animale " + animale + " non è presente nel set.");
        }
    }
    public static Set<String> createSet(){
        Set<String> animali = new HashSet<>() ;
        animali.add("nibbio");
        animali.add("coleottero");
        animali.add("cane");
        return animali;
    }
}