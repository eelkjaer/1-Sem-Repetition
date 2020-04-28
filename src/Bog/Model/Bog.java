/*
@author Emil Elkjær Nielsen (cph-en93@cphbusiness.dk)
 */
package Bog.Model;

public class Bog {
    private int isbn;
    private String titel;
    private int aar;

    public Bog(int isbn, String titel, int aar){
        this.isbn = isbn;
        this.titel = titel;
        this.aar = aar;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getAar() {
        return aar;
    }

    public void setAar(int aar) {
        this.aar = aar;
    }

    @Override
    public String toString() {
        return titel + " - " + aar + " - ISBN: " + isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bog bog = (Bog) o;

        return getIsbn() == bog.getIsbn();
    }

    @Override
    public int hashCode() {
        return getIsbn();
    }
}
