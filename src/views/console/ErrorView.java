package views.console;

import models.entities.CardEntity;
import models.utils.ErrorModel;

public class ErrorView extends MainView {

	private ErrorModel error;
	private CardEntity cardOrigin, cardDestination;

	public ErrorView(ErrorModel error) {
		super();
		this.error = error;
	}

	public ErrorView(ErrorModel error, CardEntity cardOrigin, CardEntity cardDestination) {
		super();
		this.error = error;
		this.cardOrigin = cardOrigin;
		this.cardDestination = cardDestination;
	}

	@Override
	public void show() {
		this.ioController.write(this.error.toString());
		if ((this.cardOrigin != null) && (this.cardDestination != null)) {
			this.ioController.write(" de ");
			new CardView(this.cardOrigin).show();
			this.ioController.write(" sobre ");
			new CardView(this.cardDestination).show();
			this.ioController.writeNewLine("");
		} else {
			this.ioController.writeNewLine("");
		}
	}

}
