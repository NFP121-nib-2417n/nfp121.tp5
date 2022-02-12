package question1;

import java.util.*;

public class Ensemble<T> extends AbstractSet<T> {

    protected java.util.Vector<T> table = new java.util.Vector<T>();

    public int size() {
        return table.size();
    }

    public Iterator<T> iterator() {
        return table.iterator();
    }

        public boolean add(T t) {
            
            if(!this.table.contains(t)){
                this.table.add(t);
            }
            return true;
    }

    public Ensemble<T> union(Ensemble<? extends T> e) {
        // à compléter pour la question1-2
                Ensemble<T> ensembleUnion = new Ensemble<T>();
                
        ensembleUnion.addAll(table);
        ensembleUnion.addAll(e);
        
        return ensembleUnion;
    }

    public Ensemble<T> inter(Ensemble<? extends T> e) {
        // à compléter pour la question1-2
                Iterator iterator1 = this.table.iterator();
        
        
        Ensemble <T> intersection = new Ensemble<T>();
        
            while(iterator1.hasNext()){ 
                
                    T var = (T) iterator1.next();
                    Iterator iterator2 = e.iterator();
                    while(iterator2.hasNext()){
                        T var2 = (T) iterator2.next();
                        
                        if(var.equals(var2)){
                            intersection.add(var);
                            break;
                        }
  
                    }
                    
            }
        
        
        return intersection;
    }

    public Ensemble<T> diff(Ensemble<? extends T> e) {
        // à compléter pour la question1-2
                Iterator iterator1 = this.table.iterator();
        
        
        Ensemble <T> difference = new Ensemble<T>();
                        
            while(iterator1.hasNext()){   
                int diff = 1;
                T var = (T) iterator1.next();
                Iterator iterator2 = e.iterator();
                    while(iterator2.hasNext()){
                        
                        T var2 = (T) iterator2.next();
                        
                        
                        if(var.equals(var2)){
                            System.out.println(var);
                            diff = 0;
                        }
                    }
                    if(diff == 1){
                        
                        difference.add(var);
                    }
            }
            
            
        return difference;
    }

    Ensemble<T> diffSym(Ensemble<? extends T> e) {
        // à compléter pour la question1-2
                Iterator iterator1 = this.table.iterator();
        
        
        Ensemble <T> differenceSym = new Ensemble<T>();
                

            
            
            while(iterator1.hasNext()){   
                int diff = 0;
                T var = (T) iterator1.next();
                Iterator iterator2 = e.iterator();
                    while(iterator2.hasNext()){
                        
                        T var2 = (T) iterator2.next();
                        
                        if(var.equals(var2)){
                            diff = 1;
                        }
                    }
                    if(diff == 0){
                        differenceSym.add(var);
                    }
            }
                 
            Iterator iterator3 = e.iterator();

            while(iterator3.hasNext()){   
                int diff = 0;
                T var = (T) iterator3.next();
                Iterator iterator4 = this.table.iterator();
                    while(iterator4.hasNext()){
                        
                        T var2 = (T) iterator4.next();
                        
                        if(var.equals(var2)){
                            diff = 1;
                        }
                    }
                    if(diff == 0){
                        differenceSym.add(var);
                    }
            }
            
            
            
            
            
        return differenceSym;
    }
    
}