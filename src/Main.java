import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static <Animale> void main(String[] args) {
        Set<String> animali = createSet();
        String Animale = "cane";

        Iterator<String> iterator = animali.iterator();
        while (iterator.hasNext()) {
            String stringa = iterator.next();
            if(stringa.equals(animali)){
                iterator.remove();
            }
            System.out.println(stringa);
        }
        System.out.println(animali);
        animali.clear();
        System.out.println(animali);
        }

        public static Set<String> createSet () {
            Set<String> animali = new HashSet<>();
            animali.add("nibbio");
            animali.add("coleottero");
            animali.add("cane");
            return animali;
        }
    }
