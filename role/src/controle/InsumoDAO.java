package controle;

import java.util.ArrayList;
import java.util.List;

import modelo.Insumo;

public class InsumoDAO implements DAO<Insumo> {
    private ArrayList<Insumo> insumos = new ArrayList<Insumo>();

	@Override
	public List<Insumo> list() {
		return insumos;
	}
	
	public boolean insert(Insumo insumo) {
		if (insumo != null) {
			insumos.add(insumo);
			return true;
		}
		return false;
	}
	
	public boolean update(Insumo insumo, String[] params) {
		if (insumo != null) {
			insumos.add(insumo);
			return true;
		}
		return false;
	}
	
	public boolean delete(Insumo t) {
		return true;
	}

	// Singleton
	
	private static InsumoDAO instance = null;
	
	private InsumoDAO() {
        this.instance = new InsumoDAO();
    }

    public static InsumoDAO getInstance() {
        if (instance == null) {
            instance = new InsumoDAO();
        }
        return instance;
    }
}
