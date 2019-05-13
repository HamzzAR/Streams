import java.util.List;
import java.util.stream.Collectors;



public class AlphabetPosition {
	
		public StringBuilder replaceLetterWithPosition(String string) {
			StringBuilder sb = new StringBuilder();
			string.toUpperCase()
			.chars()
			.map(x -> (int) x-64)
			.filter(x -> (x>=1 && x<=26)) 
			.forEach(x -> sb.append(" "+x));
			return sb;
		}


}
