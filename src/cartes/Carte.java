package cartes;

public abstract class Carte {
	 public Carte() {
	    }
	@Override
    public boolean equals(Object obj) {
        if (obj==null){
            return false;
        }
        if(obj.getClass()==this.getClass()){
            return true;
        }
        else{
            return false;
        }
    }
}
