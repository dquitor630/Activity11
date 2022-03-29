package activity7;
import java.util.Map;
public enum BasicStringOperation implements StringOperation {
	TO_LOWER('L') {
		@Override
		public String apply(String input) {
			return input.toLowerCase();
		}

	},

	TO_UPPER('U') {
		@Override
		public String apply(String input) {
			return input.toUpperCase();
		}

	};

	private final char symbol;

	private BasicStringOperation(char symbol) {
		this.symbol = symbol;
	}
	
	
	public char getSymbol() {
		return symbol;
	}

	private static final Map<Character, BasicStringOperation> symbolToOperation = Map.of(BasicStringOperation.TO_LOWER.getSymbol(), BasicStringOperation.TO_LOWER, BasicStringOperation.TO_UPPER.getSymbol(), BasicStringOperation.TO_UPPER);
	
	public static BasicStringOperation fromSymbol(char symbol) {
		return symbolToOperation.get(symbol);
	}
}