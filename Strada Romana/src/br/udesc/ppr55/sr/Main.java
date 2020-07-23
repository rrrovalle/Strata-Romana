 
package br.udesc.ppr55.sr;
 
import java.awt.EventQueue;

import br.udesc.ppr55.sr.view.SelectionFrame;

public class Main {
    
	/**
	 * Launch the game board.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
					new SelectionFrame();
			}
		});
	}
}
