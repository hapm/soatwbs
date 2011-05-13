package fhbrs.soa.teamwork.fhbuchen;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

@WebService
public class RelationService {
	public List<Relation> listAllRelations() {
		List<Relation> result = new ArrayList<Relation>();
		return result;
	}
	
	public List<Relation> listUncheckedRelations() {
		List<Relation> result = new ArrayList<Relation>();
		return result;
	}
}
