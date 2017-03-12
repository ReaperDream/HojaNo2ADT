import java.util.Vector;

public class Pila implements Stack {
	private Vector stack = new Vector();

	@Override
	public void Agregar(Object agregar) {
		// TODO Auto-generated method stub
		stack.addElement(agregar);
	}

	@Override
	public Object remover() {
		return stack.remove(stack.size()-1);
	}

	@Override
	public Object TamVector() {
		return stack.size();
		// TODO Auto-generated method stub
		
	}
}
