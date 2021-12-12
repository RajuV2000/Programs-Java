package com.xworkz.president;

import com.xworkz.president.dao.PresidentDao;
import com.xworkz.president.dto.PresidentDto;

public class PresidentCommence {
	public static void main(String[] args) {
		
		PresidentDto dto[] = new PresidentDto[50];
		
		dto[0] = new PresidentDto("Ramnath Kovind", "India", 76, "Hindi");
		dto[1] = new PresidentDto("Joko Widodo", "Indonesia", 56, "Tagalog");
		dto[2] = new PresidentDto("Ebrahim Raisi", "Iran", 73, "Irani");
		dto[3] = new PresidentDto("Ilir Meta", "Albania", 71, "Albanian");
		dto[4] = new PresidentDto("Abdelmadjid Tebboune", "Algeria", 68, "Arabic");
		dto[5] = new PresidentDto("Joan Enric", "Andorra", 67, "Catalan");
		dto[6] = new PresidentDto("Alberto Fernadez", "Argentina", 56, "Spanish");
		dto[7] = new PresidentDto("David Hurley", "Australia", 60, "English");
		dto[8] = new PresidentDto("Alexander Van der Bellen", "Austria", 65, "German");
		dto[9] = new PresidentDto("Abdul Hamid", "Bangladesh", 63, "Bengali");
		dto[10] = new PresidentDto("Dame Sandra Mason", "Barbados", 51, "English");
		dto[11] = new PresidentDto("Alexander Lukashenko", "Belarus", 55, "Belarusian");
		dto[12] = new PresidentDto("Phillepe", "Belgium", 59, "Dutch");
		dto[13] = new PresidentDto("Jigme Khesar", "Bhutan", 61, "Dzongkha");
		dto[14] = new PresidentDto("Luis Arce", "Bolivia", 66, "Spanish");
		dto[15] = new PresidentDto("Mokgwee", "Indonesia", 56, "Tagalog");
		dto[16] = new PresidentDto("Faustin-Archange Touadera","Central African Republic", 64," French");
		dto[17] = new PresidentDto("Felix Tshisekedi","Congo",58,"Frech");
		dto[18] = new PresidentDto("Zoran Milanovic","Croatia",55,"Standard Croatian");
		dto[19] = new PresidentDto("Milos Zeman","Czech Republic",77,"Czech");
	    dto[20] = new PresidentDto("Ismail Omar Guelleh"," Djibouti",74," French and Arabic");
	    dto[21] = new PresidentDto("Charles Savarin","Dominica",78,"English");
	    dto[22] = new PresidentDto("Francisco Guterres","East Timor",67,"Austronesian");
	    dto[23] = new PresidentDto("Abdel Fattah el-Sisi","Egypt",67,"Modern Standard Arabic");
	    dto[24] = new PresidentDto("Nayib Bukele","El Salvador",40,"Spanish");
	    dto[25] = new PresidentDto("Alar Karis"," Estonian",63,"Estonia");
	    dto[26] = new PresidentDto("Sahle-Work Zewde","Ethiopia",71,"Amharic");
	    dto[27] = new PresidentDto("Sauli Niinisto","Finland",73,"Finnish and Swedish");
	    dto[28] = new PresidentDto("Salome Zourabichvili","Georgia",69,"kartuli ena");
	    dto[29] = new PresidentDto("Abdrabbuh Mansur Hadi","Yemen",76,"Arabic");
	    dto[30] = new PresidentDto("Frank-Walter Steinmeier","Germany",65,"Indo-European");
	    dto[31] = new PresidentDto("Katerina Sakellaropoulou","Greece",69,"Greek");
	    dto[32] = new PresidentDto("Umaro Sissoco Embalo","Guinea-Bissau",49,"Portuguese");
	    dto[33] = new PresidentDto("Janos Ader","Hungary",62,"Hungarian");
	    dto[34] = new PresidentDto("Guoni Th. Johannesson","Iceland",53,"Icelandic");
	    dto[35] = new PresidentDto("Isaac Herzog","Israel",61,"Hebrew");
	    dto[36] = new PresidentDto("Egils Levits","Latvia",66,"Latvian");
	    dto[37] = new PresidentDto("Michel Aoun","Lebanon",88,"Arabic");
	    dto[38] = new PresidentDto("Gitanas Nauseda","Lithuania",57,"Lithuanian");
	    dto[39] = new PresidentDto("Andry Rajoelina","Madagascar",47,"French");
	    dto[40] = new PresidentDto("George Vella","Malta",65,"Maltese");
	    dto[41] = new PresidentDto("Mohamed Ould Ghazouani","Mauritania",65,"Arabic");
	    dto[42] = new PresidentDto("Prithvirajsing Roopun","Mauritius",62,"English");
	    dto[43] = new PresidentDto("Maia Sandu","Moldova",49,"Romanian");
	    dto[44] = new PresidentDto("Bidhya Devi Bhandari","Nepal",60,"Nepali");
	    dto[45] = new PresidentDto("Mohamed Bazoum","Niger",61,"French");
	    dto[46] = new PresidentDto("Stevo Pendarovski","North Macedonia",58,"Albanian");
	    dto[47] = new PresidentDto("Mahmoud Abbas","Palestine",86,"Arabic");
	    dto[48] = new PresidentDto("Klaus Iohannis","Romania",62,"Romanian");
	    dto[49] = new PresidentDto("Vladimir Putin","Russia",69,"Russian");

		PresidentDao dao = new PresidentDao();
		
		for(int i=0; i<dto.length;i++) {
			dao.save(dto[i]);
		}
		
		//Search by name....
		System.out.println(dao.find((name, ref)->(name.getName().equalsIgnoreCase(ref)), "Joko widodo"));
		
		//Search by language....
		System.out.println(dao.find((lang, ref1)->(lang.getLanguage().equalsIgnoreCase(ref1)), "Romanian"));
		
		//Search by country.....
		System.out.println(dao.find((country, ref2)->(country.getCountry().equalsIgnoreCase(ref2)), "Russia"));
		
		//Search by Age.....
		System.out.println(dao.find((age, ref3)->(age.getAge()== Integer.parseInt(ref3)), "61"));
	}
}
