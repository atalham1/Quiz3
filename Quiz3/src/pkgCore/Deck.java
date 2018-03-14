package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

import pkgEnum.eRank;
import pkgEnum.eSuit;

public class Deck {

	private ArrayList<Card> cardsInDeck;

	public Deck() {
		for (eSuit eSuit : eSuit.values()) {
			for (eRank eRank : eRank.values()) {
				cardsInDeck.add(new Card(eSuit, eRank));
			}
		}
		Collections.shuffle(cardsInDeck);
	}

	public Card Draw() {

		return cardsInDeck.remove(0);

	}
	
	private int getRemaining(Object eNum) {
		int count = 0;
		for (int n = 0; n < cardsInDeck.size(); n++) {
			if (eNum instanceof eSuit && cardsInDeck.get(n).geteSuit() == eNum) {
				count++;
			}
			else if (eNum instanceof eRank && cardsInDeck.get(n).geteRank() == eNum) {
				count++;
			}
		}
		return count;
	}

}
