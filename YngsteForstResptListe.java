
public class YngsteForstResptListe extends EnkelResptListe {
    YngsteForstResptListe(Node forste, Node siste) {
        super(forste, siste);
    }
    public void settInnForst(Resepter r){
        Node ny = new Node (r);
        if (getForste()==null){
            setForste(ny);
            setSiste(ny);
        }
        else {
            ny.neste=getForste();
            setForste(ny);
    }}
}
