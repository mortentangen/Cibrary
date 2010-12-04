package no.ciber.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import no.ciber.model.Bok;

@Service
public class BokServiceImpl implements BokService {

	@Override
	public List<Bok> getBoker() {
		List<Bok> boker = new ArrayList<Bok>();
		boker.add(new Bok(1, "Harry Potter og de vises stein", "J. K. Rowling", "123456789"));
		boker.add(new Bok(2, "Decision Point", "George Bush", "123456780"));
		return boker;
	}

}
