 /**
 * StartGameCommand Class
 * @author Rodrigo Valle e Robson de Jesus
 * @since 12/08/2020
 * @version 1.0
 */
package br.udesc.ppr55.sr.view.command.stradaCommands;

import br.udesc.ppr55.sr.control.InterfaceStradaC;
import br.udesc.ppr55.sr.view.command.StradaCommander;

public class StartGameCommand extends StradaCommander {
	
	public StartGameCommand(InterfaceStradaC controller) {
		super(controller);
	}
	 
	@Override
	public void execute() {    
		controller.startGame();
	}
 
}
