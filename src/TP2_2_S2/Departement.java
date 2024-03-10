package TP2_2_S2;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Departement {
	private int idDep;
	Set<Employe> LEmployes ;
	
	public Departement(int idDep, Set<Employe> lEmployes) {
		
		this.idDep = idDep;
		LEmployes = lEmployes;
	}
	
	public void ajoutEmploye(Employe E) {

		if(E.getCin() > 0)
		{
			LEmployes.add(E);
			E.setDépartement(idDep);
			
		}
		 
	}

	
	public void retirerEmploye(Employe E) {

		
		LEmployes.remove(E);
	}

	public void afficheDep()
	{
		Iterator<Employe> l = LEmployes.iterator();
		
		System.out.println("departement "+this.getIdDep()+ ":");
		while (l.hasNext())
		{
			System.out.println(l.next().toString());
		}
	
	}


	public boolean existeE(int cin) {
		Employe l = new Employe (cin);
		return LEmployes.contains(l);
			 
		
		
	}


	public Employe getEmpSalMax() {
		
		TreeSet<Employe> ET = new TreeSet<Employe>(LEmployes);
		return ET.first();
		
	}


	public int getIdDep() {
		return idDep;
	}


	public void setIdDep(int idDep) {
		this.idDep = idDep;
	}


	public Set<Employe> getLEmployes() {
		return LEmployes;
	}


	public void setLEmployes(Set<Employe> lEmployes) {
		LEmployes = lEmployes;
	}


	@Override
	public String toString() {
		return "Departement [idDep=" + idDep + ", LEmployes=" + LEmployes + "]";
	}



	

}
