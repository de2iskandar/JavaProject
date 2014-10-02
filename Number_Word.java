public final class NumberUtils { 

    private static String[] numbers = {"se", "dua ", "tiga ", "empat ", "lima ", "enam ", "tujuh ", "delapan ", "sembilan "}; 
    private static String[] levels = {"ribu ", "juta ", "milyar ", "trilyun "}; 
            
    public static String numberWording(long number) { 
        StringBuffer result = new StringBuffer(); 
    
        String str = String.valueOf(number); 
        int mod = str.length() % 3; 
        int len = str.length() / 3; 
        if(mod>0) len++; else mod = 3; 
        int begin = 0; 
        int end = mod; 
        for(int i=0; i<len; i++) { 
            int level = len-i; 

            String val = str.substring(begin, end); 
            int value = Integer.parseInt(val); 
            int length = val.length 
(); 
            for(int j=0; j<length; j++) { 
                int num = parseInt(val.charAt(j)); 
                switch(length-j) { 
                    case 3: 
                        if(num>0) result.append 
(numbers[num-1]).append("ratus "); 
                        break; 
                    case 2: 
                        if(num>1) result.append(numbers[num-1]).append("puluh "); 
                        else if(num==1) 
result.append(numbers[parseInt(val.charAt(++j))-1]).append("belas "); 
                        break; 
                    case 1: 
                        if(num>1 || (level==2 && value==1)) result.append 
(numbers[num-1]); 
                        else if(num==1) result.append("satu "); 
                        break; 
                } 
            } 

            if(level>1 && value>0) 
result.append(levels[level-2]); 
            begin = i*3 + mod; 
            end += 3; 
        } 
        
        return result.toString(); 
    } 

    public static int parseInt(char c) { 
        int result = c - 48; 
        if(result<0 || result>9) throw new NumberFormatException("For input char: '"+c+"'"); 
        return result; 
    } 
} 



C# 
    public class NumberUtils 
    { 
        private static 
string[] numbers = { "se", "dua ", "tiga ", "empat ", "lima ", "enam ", 
"tujuh ", "delapan ", "sembilan " }; 
        private static string[] levels = { "ribu ", "juta ", "milyar ", "trilyun " }; 

        public static string NumberWording(long number) 
        { 
            StringBuilder sb = new StringBuilder(); 

            string str = number.ToString(); 
            int mod = str.Length % 3; 
            int len = str.Length / 3; 
            if (mod > 0) len++; else mod = 3; 
            for (int i = 0; i < len; i++) 
            { 
                int level = len - i; 

                string val = i == 0 ? 
                    str.Substring(0, mod) : str.Substring(i * 3 + mod - 3, 3); 
                int value = int.Parse 
(val); 
                int length = val.Length; 
                for (int j = 0; j < length; j++) 
                { 
                    int num = int.Parse(val[j].ToString()); 
                    switch (length - j) 
                    { 
                        case 3: 
                            if (num > 0) sb.Append(numbers[num - 1]).Append("ratus "); 
                            break; 
                        case 2: 
                            if (num > 1) sb.Append(numbers[num - 1]).Append("puluh "); 
                            else if (num == 1) sb.Append(numbers[int.Parse(val[++j].ToString()) - 1]).Append("belas "); 
                            break; 
                        case 1: 
                            if (num > 1 || (level == 2 && value == 1)) sb.Append(numbers[num - 1]); 
                            else if (num == 1) 
sb.Append("satu "); 
                            break; 
                    } 
                } 

                if (level > 1 && value > 0) sb.Append(levels[level - 2]); 
            } 

            return sb.ToString(); 
        } 
    } 