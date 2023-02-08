
    public class Receitas {
        String nomedareceita;
        String tipodareceita;
        String duracaodareceita;
        String nacionalidadedareceita;
        
    
        public Receitas( String nomedareceita,
        String tipodareceita,
        String duracaodareceita,
        String nacionalidadedareceita){
         this.nomedareceita=nomedareceita;
         this.tipodareceita=tipodareceita;
         this.duracaodareceita=duracaodareceita;
         this.nacionalidadedareceita=nacionalidadedareceita;
         
        }
        public void nomedareceita(){
            System.out.println("nomedareceita:  " +nomedareceita);
            System.out.println("tipodareceita:  "+tipodareceita);
            System.out.println("duraçãodareceita:  "+duracaodareceita);
            System.out.println("nacionalidadedareceita:  "+nacionalidadedareceita);
        }
    
    
    
    
        
        public static void main(String[]args) {
            Receitas Receitas= new Receitas("Strogonoff", "Refeição", "40 min", "Rússia");
            Receitas.nomedareceita();
        }
    }
