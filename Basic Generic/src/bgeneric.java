
public class bgeneric {
	public static void main(String[]args) {
		Integer[] int_list = {1,2,3,4,5};
		String[] string_list = {"Berke", "Java", "Fenerbahce"};
		Language[] language_list = {new Language("English"), new Language("Turkish")};
		
		writer<Integer> integer_writer = new writer<Integer>();
		writer<String> string_writer = new writer<String>();
		writer<Language> language_writer = new writer<Language>();
		
		integer_writer.write(int_list);   // line 8 + write(line4)
		string_writer.write(string_list); // line 9 + write(line5)
		language_writer.write(language_list);
		}
		}

	// Thanks to Generic, we can call and use even data of different character types with the same method and function.
   // Generic sayesinde, farkli karakter tipindeki verileri bile ayni method, fonksiyon ile çagirabilip kullanabiliyoruz.

