package DAO;
import java.util.ArrayList;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;


public class TableModelF extends AbstractTableModel {
	 private ArrayList<Film> filmArrayList;
	    private String[] columns;
	    
	 public TableModelF(ArrayList<Film> daoFilmList) {
	        super();
	        filmArrayList = daoFilmList;
	        columns = new String[]{"ID", "Titre", "Année", "Nb épisode", "Coût", "Recette"};
	    }

	 public Object getData(Film unFilm, int col) {
			switch (col) {
				case 0: {
					return unFilm.getId();
				}
				case 1: {
					return unFilm.getTitre() ;
				}
				case 2: {
					return unFilm.getNumero();
				}
				case 3:{
					return unFilm.getSortie();
				}
				case 4:{
					return unFilm.getcout();
				}
				case 5:{
					return unFilm.getRecette();
				}
			}
			return null;
		}
	 
		@Override
		public String getColumnName(int column) {
			switch (column) {
			case 0: {
				return "ID";
			}
			case 1: {
				return "Titre";
			}
			case 2: {
				return "Numéro";
			}
			case 3: {
				return "Sortie";
			}
			case 4: {
				return "Cout";
			}
			case 5: {
				return "Recette";
			}
			}
			return "";
		}
	 
		@Override
		public int getRowCount() {
			return this.filmArrayList.size(); // le nombre de lignes
		}
	 
		@Override
		public int getColumnCount() {
			return 6; // le nombre de colonnes
		}

		@Override
		public Object getValueAt(int rowIndex, int columnIndex) {
			// TODO Auto-generated method stub
			return getData(this.filmArrayList.get(rowIndex), columnIndex);
		}
}
