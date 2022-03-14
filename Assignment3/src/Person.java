  

class Person implements Comparable<Person>{
    int weight,height;
    String name;
    Person(int weight,int height,String name){
        this.weight = weight;
        this.height = height;
        this.name = name;
    }

    public int compareTo(Person p) {  
        if(weight>p.weight){  
            return 1;  
        }else if(weight<p.weight){  
            return -1;  
        }else{ 
            if (height>p.height){
                return 1;
            }
            else if (height<p.height){
                return -1;
            }
            else{
                return 0;
            }
          
        }  
    }  
}
