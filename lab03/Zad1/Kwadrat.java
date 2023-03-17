package Zad1;


    public class Kwadrat {
        int bok;
        public int pole(){
            return bok * bok;
        }
        public int obwod(){
            return bok*4;
        }
        public Kwadrat(int bok){

            this.bok = bok;
        }
    }

