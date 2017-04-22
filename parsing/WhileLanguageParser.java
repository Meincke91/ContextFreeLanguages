// $ANTLR 3.5.2 while_language/parsing/WhileLanguage.g 2017-04-22 17:58:57

package while_language.parsing;

import while_language.ast.*;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class WhileLanguageParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "NUM", "WS", "'!'", "'!='", 
		"'&&'", "'*'", "'+'", "'-'", "':='", "';'", "'<='", "'='", "'else'", "'false'", 
		"'if'", "'then'", "'true'", "'while'", "'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__7=7;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int ID=4;
	public static final int NUM=5;
	public static final int WS=6;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public WhileLanguageParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public WhileLanguageParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return WhileLanguageParser.tokenNames; }
	@Override public String getGrammarFileName() { return "while_language/parsing/WhileLanguage.g"; }



	// $ANTLR start "program"
	// while_language/parsing/WhileLanguage.g:19:1: program returns [Statement value] : s= statement EOF ;
	public final Statement program() throws RecognitionException {
		Statement value = null;


		Statement s =null;

		try {
			// while_language/parsing/WhileLanguage.g:20:5: (s= statement EOF )
			// while_language/parsing/WhileLanguage.g:20:7: s= statement EOF
			{
			pushFollow(FOLLOW_statement_in_program49);
			s=statement();
			state._fsp--;

			match(input,EOF,FOLLOW_EOF_in_program51); 
			 value = s; 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "program"



	// $ANTLR start "statement"
	// while_language/parsing/WhileLanguage.g:23:1: statement returns [Statement value] : s= base_statement ( ';' s= base_statement )* ;
	public final Statement statement() throws RecognitionException {
		Statement value = null;


		Statement s =null;

		try {
			// while_language/parsing/WhileLanguage.g:24:5: (s= base_statement ( ';' s= base_statement )* )
			// while_language/parsing/WhileLanguage.g:24:7: s= base_statement ( ';' s= base_statement )*
			{
			pushFollow(FOLLOW_base_statement_in_statement76);
			s=base_statement();
			state._fsp--;

			 value = s; 
			// while_language/parsing/WhileLanguage.g:25:7: ( ';' s= base_statement )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==14) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// while_language/parsing/WhileLanguage.g:25:9: ';' s= base_statement
					{
					match(input,14,FOLLOW_14_in_statement94); 
					pushFollow(FOLLOW_base_statement_in_statement98);
					s=base_statement();
					state._fsp--;

					 value = new SeqStatement(value,s); 
					}
					break;

				default :
					break loop1;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "statement"



	// $ANTLR start "base_statement"
	// while_language/parsing/WhileLanguage.g:28:1: base_statement returns [Statement value] : ( ID ':=' e= arith_expr | 'if' c= bool_expr 'then' s1= base_statement 'else' s2= base_statement | 'while' c= bool_expr s= base_statement | '{' s= statement '}' );
	public final Statement base_statement() throws RecognitionException {
		Statement value = null;


		Token ID1=null;
		ArithExpr e =null;
		BoolExpr c =null;
		Statement s1 =null;
		Statement s2 =null;
		Statement s =null;

		try {
			// while_language/parsing/WhileLanguage.g:29:5: ( ID ':=' e= arith_expr | 'if' c= bool_expr 'then' s1= base_statement 'else' s2= base_statement | 'while' c= bool_expr s= base_statement | '{' s= statement '}' )
			int alt2=4;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt2=1;
				}
				break;
			case 19:
				{
				alt2=2;
				}
				break;
			case 22:
				{
				alt2=3;
				}
				break;
			case 23:
				{
				alt2=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// while_language/parsing/WhileLanguage.g:29:7: ID ':=' e= arith_expr
					{
					ID1=(Token)match(input,ID,FOLLOW_ID_in_base_statement125); 
					match(input,13,FOLLOW_13_in_base_statement127); 
					pushFollow(FOLLOW_arith_expr_in_base_statement131);
					e=arith_expr();
					state._fsp--;

					 value = new AssignStatement(ID1.getText(), e); 
					}
					break;
				case 2 :
					// while_language/parsing/WhileLanguage.g:30:7: 'if' c= bool_expr 'then' s1= base_statement 'else' s2= base_statement
					{
					match(input,19,FOLLOW_19_in_base_statement162); 
					pushFollow(FOLLOW_bool_expr_in_base_statement166);
					c=bool_expr();
					state._fsp--;

					match(input,20,FOLLOW_20_in_base_statement168); 
					pushFollow(FOLLOW_base_statement_in_base_statement172);
					s1=base_statement();
					state._fsp--;

					match(input,17,FOLLOW_17_in_base_statement180); 
					pushFollow(FOLLOW_base_statement_in_base_statement184);
					s2=base_statement();
					state._fsp--;

					 value = new IfStatement(c,s1,s2); 
					}
					break;
				case 3 :
					// while_language/parsing/WhileLanguage.g:32:7: 'while' c= bool_expr s= base_statement
					{
					match(input,22,FOLLOW_22_in_base_statement211); 
					pushFollow(FOLLOW_bool_expr_in_base_statement215);
					c=bool_expr();
					state._fsp--;

					pushFollow(FOLLOW_base_statement_in_base_statement228);
					s=base_statement();
					state._fsp--;

					 value = new WhileStatement(c,s); 
					}
					break;
				case 4 :
					// while_language/parsing/WhileLanguage.g:34:7: '{' s= statement '}'
					{
					match(input,23,FOLLOW_23_in_base_statement263); 
					pushFollow(FOLLOW_statement_in_base_statement267);
					s=statement();
					state._fsp--;

					match(input,24,FOLLOW_24_in_base_statement269); 
					 value = s; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "base_statement"



	// $ANTLR start "bool_expr"
	// while_language/parsing/WhileLanguage.g:37:1: bool_expr returns [BoolExpr value] : e= literal ( '&&' e= literal )* ;
	public final BoolExpr bool_expr() throws RecognitionException {
		BoolExpr value = null;


		BoolExpr e =null;

		try {
			// while_language/parsing/WhileLanguage.g:38:5: (e= literal ( '&&' e= literal )* )
			// while_language/parsing/WhileLanguage.g:38:7: e= literal ( '&&' e= literal )*
			{
			pushFollow(FOLLOW_literal_in_bool_expr316);
			e=literal();
			state._fsp--;

			 value = e; 
			// while_language/parsing/WhileLanguage.g:39:7: ( '&&' e= literal )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==9) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// while_language/parsing/WhileLanguage.g:39:9: '&&' e= literal
					{
					match(input,9,FOLLOW_9_in_bool_expr334); 
					pushFollow(FOLLOW_literal_in_bool_expr338);
					e=literal();
					state._fsp--;

					 value = new AndExpr(value,e); 
					}
					break;

				default :
					break loop3;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "bool_expr"



	// $ANTLR start "literal"
	// while_language/parsing/WhileLanguage.g:42:1: literal returns [BoolExpr value] : (e= base_bool_expr | '!' e= literal );
	public final BoolExpr literal() throws RecognitionException {
		BoolExpr value = null;


		BoolExpr e =null;

		try {
			// while_language/parsing/WhileLanguage.g:43:5: (e= base_bool_expr | '!' e= literal )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( ((LA4_0 >= ID && LA4_0 <= NUM)||LA4_0==18||LA4_0==21) ) {
				alt4=1;
			}
			else if ( (LA4_0==7) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// while_language/parsing/WhileLanguage.g:43:7: e= base_bool_expr
					{
					pushFollow(FOLLOW_base_bool_expr_in_literal366);
					e=base_bool_expr();
					state._fsp--;

					 value = e; 
					}
					break;
				case 2 :
					// while_language/parsing/WhileLanguage.g:44:7: '!' e= literal
					{
					match(input,7,FOLLOW_7_in_literal379); 
					pushFollow(FOLLOW_literal_in_literal383);
					e=literal();
					state._fsp--;

					 value = new NotExpr(e); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "literal"



	// $ANTLR start "base_bool_expr"
	// while_language/parsing/WhileLanguage.g:47:1: base_bool_expr returns [BoolExpr value] : ( 'true' | 'false' |e1= arith_expr '=' e2= arith_expr |e1= arith_expr '<=' e2= arith_expr |e1= arith_expr '!=' e2= arith_expr );
	public final BoolExpr base_bool_expr() throws RecognitionException {
		BoolExpr value = null;


		ArithExpr e1 =null;
		ArithExpr e2 =null;

		try {
			// while_language/parsing/WhileLanguage.g:48:5: ( 'true' | 'false' |e1= arith_expr '=' e2= arith_expr |e1= arith_expr '<=' e2= arith_expr |e1= arith_expr '!=' e2= arith_expr )
			int alt5=5;
			alt5 = dfa5.predict(input);
			switch (alt5) {
				case 1 :
					// while_language/parsing/WhileLanguage.g:48:7: 'true'
					{
					match(input,21,FOLLOW_21_in_base_bool_expr406); 
					 value = new BoolValueExpr(true); 
					}
					break;
				case 2 :
					// while_language/parsing/WhileLanguage.g:49:7: 'false'
					{
					match(input,18,FOLLOW_18_in_base_bool_expr444); 
					 value = new BoolValueExpr(false); 
					}
					break;
				case 3 :
					// while_language/parsing/WhileLanguage.g:50:7: e1= arith_expr '=' e2= arith_expr
					{
					pushFollow(FOLLOW_arith_expr_in_base_bool_expr483);
					e1=arith_expr();
					state._fsp--;

					match(input,16,FOLLOW_16_in_base_bool_expr485); 
					pushFollow(FOLLOW_arith_expr_in_base_bool_expr489);
					e2=arith_expr();
					state._fsp--;

					 value = new EqualsExpr(e1,e2); 
					}
					break;
				case 4 :
					// while_language/parsing/WhileLanguage.g:51:7: e1= arith_expr '<=' e2= arith_expr
					{
					pushFollow(FOLLOW_arith_expr_in_base_bool_expr504);
					e1=arith_expr();
					state._fsp--;

					match(input,15,FOLLOW_15_in_base_bool_expr506); 
					pushFollow(FOLLOW_arith_expr_in_base_bool_expr510);
					e2=arith_expr();
					state._fsp--;

					 value = new EqualsOrGreaterExpr(e1,e2); 
					}
					break;
				case 5 :
					// while_language/parsing/WhileLanguage.g:52:7: e1= arith_expr '!=' e2= arith_expr
					{
					pushFollow(FOLLOW_arith_expr_in_base_bool_expr524);
					e1=arith_expr();
					state._fsp--;

					match(input,8,FOLLOW_8_in_base_bool_expr526); 
					pushFollow(FOLLOW_arith_expr_in_base_bool_expr530);
					e2=arith_expr();
					state._fsp--;

					 value = new NotEqualsExpr(e1,e2); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "base_bool_expr"



	// $ANTLR start "arith_expr"
	// while_language/parsing/WhileLanguage.g:55:1: arith_expr returns [ArithExpr value] : e= mult_arith_expr ( '+' e= mult_arith_expr | '-' e= mult_arith_expr )* ;
	public final ArithExpr arith_expr() throws RecognitionException {
		ArithExpr value = null;


		ArithExpr e =null;

		try {
			// while_language/parsing/WhileLanguage.g:56:5: (e= mult_arith_expr ( '+' e= mult_arith_expr | '-' e= mult_arith_expr )* )
			// while_language/parsing/WhileLanguage.g:56:7: e= mult_arith_expr ( '+' e= mult_arith_expr | '-' e= mult_arith_expr )*
			{
			pushFollow(FOLLOW_mult_arith_expr_in_arith_expr557);
			e=mult_arith_expr();
			state._fsp--;

			 value = e; 
			// while_language/parsing/WhileLanguage.g:57:7: ( '+' e= mult_arith_expr | '-' e= mult_arith_expr )*
			loop6:
			while (true) {
				int alt6=3;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==11) ) {
					alt6=1;
				}
				else if ( (LA6_0==12) ) {
					alt6=2;
				}

				switch (alt6) {
				case 1 :
					// while_language/parsing/WhileLanguage.g:57:9: '+' e= mult_arith_expr
					{
					match(input,11,FOLLOW_11_in_arith_expr575); 
					pushFollow(FOLLOW_mult_arith_expr_in_arith_expr579);
					e=mult_arith_expr();
					state._fsp--;

					 value = new PlusExpr(value,e); 
					}
					break;
				case 2 :
					// while_language/parsing/WhileLanguage.g:58:9: '-' e= mult_arith_expr
					{
					match(input,12,FOLLOW_12_in_arith_expr592); 
					pushFollow(FOLLOW_mult_arith_expr_in_arith_expr596);
					e=mult_arith_expr();
					state._fsp--;

					 value = new MinusExpr(value,e); 
					}
					break;

				default :
					break loop6;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "arith_expr"



	// $ANTLR start "mult_arith_expr"
	// while_language/parsing/WhileLanguage.g:61:1: mult_arith_expr returns [ArithExpr value] : e= base_arith_expr ( '*' e= base_arith_expr )* ;
	public final ArithExpr mult_arith_expr() throws RecognitionException {
		ArithExpr value = null;


		ArithExpr e =null;

		try {
			// while_language/parsing/WhileLanguage.g:62:5: (e= base_arith_expr ( '*' e= base_arith_expr )* )
			// while_language/parsing/WhileLanguage.g:62:7: e= base_arith_expr ( '*' e= base_arith_expr )*
			{
			pushFollow(FOLLOW_base_arith_expr_in_mult_arith_expr624);
			e=base_arith_expr();
			state._fsp--;

			 value = e; 
			// while_language/parsing/WhileLanguage.g:63:7: ( '*' e= base_arith_expr )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==10) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// while_language/parsing/WhileLanguage.g:63:9: '*' e= base_arith_expr
					{
					match(input,10,FOLLOW_10_in_mult_arith_expr642); 
					pushFollow(FOLLOW_base_arith_expr_in_mult_arith_expr646);
					e=base_arith_expr();
					state._fsp--;

					 value = new MultExpr(value,e); 
					}
					break;

				default :
					break loop7;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "mult_arith_expr"



	// $ANTLR start "base_arith_expr"
	// while_language/parsing/WhileLanguage.g:66:1: base_arith_expr returns [ArithExpr value] : ( NUM | ID );
	public final ArithExpr base_arith_expr() throws RecognitionException {
		ArithExpr value = null;


		Token NUM2=null;
		Token ID3=null;

		try {
			// while_language/parsing/WhileLanguage.g:67:5: ( NUM | ID )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==NUM) ) {
				alt8=1;
			}
			else if ( (LA8_0==ID) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// while_language/parsing/WhileLanguage.g:67:7: NUM
					{
					NUM2=(Token)match(input,NUM,FOLLOW_NUM_in_base_arith_expr672); 
					 value = new NumExpr(Integer.parseInt(NUM2.getText())); 
					}
					break;
				case 2 :
					// while_language/parsing/WhileLanguage.g:68:7: ID
					{
					ID3=(Token)match(input,ID,FOLLOW_ID_in_base_arith_expr682); 
					 value = new IdExpr(ID3.getText()); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "base_arith_expr"

	// Delegated rules


	protected DFA5 dfa5 = new DFA5(this);
	static final String DFA5_eotS =
		"\27\uffff";
	static final String DFA5_eofS =
		"\27\uffff";
	static final String DFA5_minS =
		"\1\4\2\uffff\2\10\3\4\3\uffff\6\10\2\4\4\10";
	static final String DFA5_maxS =
		"\1\25\2\uffff\2\20\3\5\3\uffff\6\20\2\5\4\20";
	static final String DFA5_acceptS =
		"\1\uffff\1\1\1\2\5\uffff\1\3\1\4\1\5\14\uffff";
	static final String DFA5_specialS =
		"\27\uffff}>";
	static final String[] DFA5_transitionS = {
			"\1\4\1\3\14\uffff\1\2\2\uffff\1\1",
			"",
			"",
			"\1\12\1\uffff\1\5\1\6\1\7\2\uffff\1\11\1\10",
			"\1\12\1\uffff\1\5\1\6\1\7\2\uffff\1\11\1\10",
			"\1\14\1\13",
			"\1\16\1\15",
			"\1\20\1\17",
			"",
			"",
			"",
			"\1\12\1\uffff\1\5\1\6\1\7\2\uffff\1\11\1\10",
			"\1\12\1\uffff\1\5\1\6\1\7\2\uffff\1\11\1\10",
			"\1\12\1\uffff\1\21\1\6\1\7\2\uffff\1\11\1\10",
			"\1\12\1\uffff\1\21\1\6\1\7\2\uffff\1\11\1\10",
			"\1\12\1\uffff\1\22\1\6\1\7\2\uffff\1\11\1\10",
			"\1\12\1\uffff\1\22\1\6\1\7\2\uffff\1\11\1\10",
			"\1\24\1\23",
			"\1\26\1\25",
			"\1\12\1\uffff\1\21\1\6\1\7\2\uffff\1\11\1\10",
			"\1\12\1\uffff\1\21\1\6\1\7\2\uffff\1\11\1\10",
			"\1\12\1\uffff\1\22\1\6\1\7\2\uffff\1\11\1\10",
			"\1\12\1\uffff\1\22\1\6\1\7\2\uffff\1\11\1\10"
	};

	static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
	static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
	static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
	static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
	static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
	static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
	static final short[][] DFA5_transition;

	static {
		int numStates = DFA5_transitionS.length;
		DFA5_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
		}
	}

	protected class DFA5 extends DFA {

		public DFA5(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 5;
			this.eot = DFA5_eot;
			this.eof = DFA5_eof;
			this.min = DFA5_min;
			this.max = DFA5_max;
			this.accept = DFA5_accept;
			this.special = DFA5_special;
			this.transition = DFA5_transition;
		}
		@Override
		public String getDescription() {
			return "47:1: base_bool_expr returns [BoolExpr value] : ( 'true' | 'false' |e1= arith_expr '=' e2= arith_expr |e1= arith_expr '<=' e2= arith_expr |e1= arith_expr '!=' e2= arith_expr );";
		}
	}

	public static final BitSet FOLLOW_statement_in_program49 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program51 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_base_statement_in_statement76 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_14_in_statement94 = new BitSet(new long[]{0x0000000000C80010L});
	public static final BitSet FOLLOW_base_statement_in_statement98 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_ID_in_base_statement125 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_base_statement127 = new BitSet(new long[]{0x0000000000000030L});
	public static final BitSet FOLLOW_arith_expr_in_base_statement131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_base_statement162 = new BitSet(new long[]{0x00000000002400B0L});
	public static final BitSet FOLLOW_bool_expr_in_base_statement166 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_base_statement168 = new BitSet(new long[]{0x0000000000C80010L});
	public static final BitSet FOLLOW_base_statement_in_base_statement172 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_base_statement180 = new BitSet(new long[]{0x0000000000C80010L});
	public static final BitSet FOLLOW_base_statement_in_base_statement184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_base_statement211 = new BitSet(new long[]{0x00000000002400B0L});
	public static final BitSet FOLLOW_bool_expr_in_base_statement215 = new BitSet(new long[]{0x0000000000C80010L});
	public static final BitSet FOLLOW_base_statement_in_base_statement228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_base_statement263 = new BitSet(new long[]{0x0000000000C80010L});
	public static final BitSet FOLLOW_statement_in_base_statement267 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_base_statement269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_bool_expr316 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_9_in_bool_expr334 = new BitSet(new long[]{0x00000000002400B0L});
	public static final BitSet FOLLOW_literal_in_bool_expr338 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_base_bool_expr_in_literal366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_7_in_literal379 = new BitSet(new long[]{0x00000000002400B0L});
	public static final BitSet FOLLOW_literal_in_literal383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_base_bool_expr406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_base_bool_expr444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arith_expr_in_base_bool_expr483 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_base_bool_expr485 = new BitSet(new long[]{0x0000000000000030L});
	public static final BitSet FOLLOW_arith_expr_in_base_bool_expr489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arith_expr_in_base_bool_expr504 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_base_bool_expr506 = new BitSet(new long[]{0x0000000000000030L});
	public static final BitSet FOLLOW_arith_expr_in_base_bool_expr510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arith_expr_in_base_bool_expr524 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_base_bool_expr526 = new BitSet(new long[]{0x0000000000000030L});
	public static final BitSet FOLLOW_arith_expr_in_base_bool_expr530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mult_arith_expr_in_arith_expr557 = new BitSet(new long[]{0x0000000000001802L});
	public static final BitSet FOLLOW_11_in_arith_expr575 = new BitSet(new long[]{0x0000000000000030L});
	public static final BitSet FOLLOW_mult_arith_expr_in_arith_expr579 = new BitSet(new long[]{0x0000000000001802L});
	public static final BitSet FOLLOW_12_in_arith_expr592 = new BitSet(new long[]{0x0000000000000030L});
	public static final BitSet FOLLOW_mult_arith_expr_in_arith_expr596 = new BitSet(new long[]{0x0000000000001802L});
	public static final BitSet FOLLOW_base_arith_expr_in_mult_arith_expr624 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_mult_arith_expr642 = new BitSet(new long[]{0x0000000000000030L});
	public static final BitSet FOLLOW_base_arith_expr_in_mult_arith_expr646 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_NUM_in_base_arith_expr672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_base_arith_expr682 = new BitSet(new long[]{0x0000000000000002L});
}
