public class FigurasService {
    
    
    
    /*
     * 
     */
    public void figuraNº11For(int filas){
         for (int i = 1; i <= filas; i++) {
            System.out.print("|");
            for (int j = 1; j <= i; j++) {
                System.out.print("_");
            }
            System.out.println();
            for (int k = 3; k <=(4* i); k++) {
            System.out.print(" ");
            }
        }
    }
    /*
     * 
     */
    public void figuraNº11While(int filas){
        int i = 1;
        while (i <= filas) {
            System.out.print("|");
            int j = 1;
            while (j <= i) {
                System.out.print("_");
                j++;
            }
            System.out.println();
            int k = 3;
            while (k <= (4 * i)) {
                System.out.print(" ");
                k++;
            }
            i++;
        }
    }
    /*
     * 
     */
    public void figuraNº11DoWhile(int filas){
        int i = 1;
        do {
            System.out.print("|");
            int j = 1;
            do {
                System.out.print("_");
                j++;
            } while (j <= i);
            System.out.println();
            int k = 3;
            do {
                System.out.print(" ");
                k++;
            } while (k <= (4 * i));
            i++;
        } while (i <= filas);
        }
        /*
         * 
         */
        public void figuraNº12For(int serieNumerica){
        for (int j=1; j<=9; j++) {
            System.out.println(serieNumerica);
            serieNumerica = serieNumerica / 10;
        }
        }
        
        /*
         * 
         */
        public void figuraNº12While(int serieNumerica){
        int j=1;
        while (j<=9) {
            System.out.println(serieNumerica);
            serieNumerica = serieNumerica / 10;
            j++;
        }
        }
        /*
         * 
         */
        public void figuraNº12DoWhile(int serieNumerica){
        int j=1;
        do {
            System.out.println(serieNumerica);
            serieNumerica = serieNumerica / 10;
            j++;
        } while (j<=9);
        }
        /*
         * 
         */
        public void figuraNº13For(int filas){
        int j=1;
        for(int n=1;n<=filas;n++){
            System.out.println(j);
            j*=10;
            j+=(n+1);
        }
        }
        /*
         * 
         */
        public void figuraNº13While(int filas){
        int j=1;
        int n=1;
        while (n<=filas){
            System.out.println(j);
            j*=10;
            j+=(n+1);
            n++;
        }
        }
        /*
         * 
         */
        public void figuraNº13DoWhile(int filas){
        int j=1;
        int n=1;
        System.out.println("");
        do {
            System.out.println(j);
            j*=10;
            j+=(n+1);
            n++;
        } while (n<=filas);
        }
        /*
         * 
         */
        public void figuraNº14For(int filas){
            for (int i = 0; i < filas; i++) {
            int numero = 1;
            for (int espacio = 0; espacio < filas - i; espacio++) {
                System.out.print("  ");
            }
            for (int columna = 0; columna <= i; columna++) {
                System.out.printf("%4d", numero);
                numero = numero * ( i - columna) / (columna + 1);
            }
            System.out.println();
        }
        }
        /*
         * 
         */
        public void figuraNº14While(int filas){
            int i = 0;
            while (i < filas) {
            int numero = 1;
            int espacio = 0;
            while (espacio < filas - i) {
                System.out.print("  ");
                espacio++;
            }
            int columna = 0;
            while (columna <= i) {
                System.out.printf("%4d", numero);
                numero = numero * ( i - columna) / (columna + 1);
                columna++;
            }
            System.out.println();
            i++;
        }
    }
    /*
     * 
     */
    public void figuraNº14DoWhile(int filas){
            int i = 0;
            do {
            int numero = 1;
            int espacio = 0;
            do {
                System.out.print("  ");
                espacio++;
            } while (espacio < filas - i);
            int columna = 0;
            do {
                System.out.printf("%4d", numero);
                numero = numero * ( i - columna) / (columna + 1);
                columna++;
            } while (columna <= i);
            System.out.println();
            i++;
        } while (i < filas);
    }
    /*
     * 
     */
    public void figuraNº15For(int filas){
        for(int i=0;i<filas;i++){
            int numero=1;
            for(int columna=0;columna<=i;columna++){
                System.out.printf("%4d", numero);
                numero = numero * (i - columna) / (columna + 1);
        }
        System.out.println();
    }
    }
    /*
     * 
     */
    public void figuraNº15While(int filas){
        int i=0;
        while(i<filas){
            int numero=1;
            int columna=0;
            while(columna<=i){
                System.out.printf("%4d", numero);
                numero = numero * (i - columna) / (columna + 1);
                columna++;
        }
        System.out.println();
        i++; 
        }
     }
     /*
     * 
      */
        public void figuraNº15DoWhile(int filas){
            int i=0;
            do {
                int numero=1;
                int columna=0;
                do {
                    System.out.printf("%4d", numero);
                    numero = numero * (i - columna) / (columna + 1);
                    columna++;
            } while (columna<=i);
            System.out.println();
            i++; 
            } while (i<filas);
        }
        /*
         * 
         */
        public void figuraº16For(int filasImpares){
            if(filasImpares % 2 == 0){
                filasImpares++;
            }
            for(int i=1; i<=filasImpares;i++){
                for(int c=1;c<=filasImpares;c++){
                    if(c==i || c==(filasImpares-i+1)){
                        if(i%2!=0 || c%2!=0){
                            System.out.print("+");
                    } else{
                        System.out.print("-");
                    }
                } else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        /*
         * 
         */
        public void figuraº16While(int filasImpares){
            if(filasImpares % 2 == 0){
                filasImpares++;
            }
            int i=1;
            while(i<=filasImpares){
                int c=1;
                while(c<=filasImpares){
                    if(c==i || c==(filasImpares-i+1)){
                        if(i%2!=0 || c%2!=0){
                            System.out.print("+");
                    } else{
                        System.out.print("-");
                    }
                } else{
                        System.out.print(" ");
                    }
                    c++;
                }
                System.out.println();
                i++;
            }
        }
        /*
         * 
         */
        public void figuraº16DoWhile(int filasImpares){
            if(filasImpares % 2 == 0){
                filasImpares++;
            }
            int i=1;
            do {
                int c=1;
                do {
                    if(c==i || c==(filasImpares-i+1)){
                        if(i%2!=0 || c%2!=0){
                            System.out.print("+");
                    } else{
                        System.out.print("-");
                    }
                } else{
                        System.out.print(" ");
                    }
                    c++;
                } while(c<=filasImpares);
                System.out.println();
                i++;
            } while(i<=filasImpares);
        }
        /*
         * 
         */
        public void figuraNº17For(int filasImpares){
            if(filasImpares % 2 == 0){
                filasImpares++;
            }
            for(int i=1; i<=filasImpares;i++){
                for(int c=1;c<=filasImpares;c++){
                    if(c==i || c==(filasImpares-i+1)){
                        if(i%2!=0 || c%2!=0){
                            System.out.print("1");
                    } else{
                        System.out.print("0");
                    }
                } else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        /*
         * 
         */
        public void figuraNº17While(int filasImpares){  
            if(filasImpares % 2 == 0){
                filasImpares++;
            }
            int i=1;
            while(i<=filasImpares){
                int c=1;
                while(c<=filasImpares){
                    if(c==i || c==(filasImpares-i+1)){
                        if(i%2!=0 || c%2!=0){
                            System.out.print("1");
                    } else{
                        System.out.print("0");
                    }
                } else{
                        System.out.print(" ");
                    }
                    c++;
                }
                System.out.println();
                i++;
            }
        }
        /*
         * 
         */
        public void figuraNº17DoWhile(int filasImpares){
            if(filasImpares % 2 == 0){
                filasImpares++;
            }
            int i=1;
            do {
                int c=1;
                do {
                    if(c==i || c==(filasImpares-i+1)){
                        if(i%2!=0 || c%2!=0){
                            System.out.print("1");
                    } else{
                        System.out.print("0");
                    }
                } else{
                        System.out.print(" ");
                    }
                    c++;
                } while(c<=filasImpares);
                System.out.println();
                i++;
            } while(i<=filasImpares);
        }
        /*
         * 
         */
        public void figuraNº18For(int filas){
        int[] prev = {2};
        for (int r = 1; r <= filas; r++) {
            for (int d = 0; d < prev.length; d++) {
                System.out.print(prev[d]);
            }
            System.out.println();
            int[] next = new int[prev.length + 1];
            next[0] = 1;
            for (int k = 1; k <= prev.length - 1; k++) {
                next[k] = prev[k - 1] + prev[k];
            }
            next[next.length - 1] = 2;
            prev = next;
        }
        }
        /*
         * 
         */
        public void figuraNº18While(int filas){
        int[] prev = {2};
        int r = 1;
        while (r <= filas) {
            int d = 0;
            while (d < prev.length) {
                System.out.print(prev[d]);
                d++;
            }
            System.out.println();
            int[] next = new int[prev.length + 1];
            next[0] = 1;
            int k = 1;
            while (k <= prev.length - 1) {
                next[k] = prev[k - 1] + prev[k];
                k++;
            }
            next[next.length - 1] = 2;
            prev = next;
            r++;
        }
        }
        /*
         * 
         */
        public void figuraNº18DoWhile(int filas){
        int[] prev = {2};
        int r = 1;
        do {
            int d = 0;
            do {
                System.out.print(prev[d]);
                d++;
            } while (d < prev.length);
            System.out.println();
            int[] next = new int[prev.length + 1];
            next[0] = 1;
            int k = 1;
            do {
                next[k] = prev[k - 1] + prev[k];
                k++;
            } while (k <= prev.length - 1);
            next[next.length - 1] = 2;
            prev = next;
            r++;
        } while (r <= filas);
        }
    /*
     * 
     */
    public void figuraNº19For(int filas){
        int [] prev = {2};
        for (int r = 1; r <= filas; r++) {
            for (int d = 0; d < prev.length; d++) {
                if (d == 0) {
                    System.out.print("*");
                } else if (d == prev.length - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(prev[d]);
                }
                System.out.println();
            int[] next = new int[prev.length + 1];
            next[0] = 1;
            for (int k = 1; k <= prev.length - 1; k++) {
                next[k] = prev[k - 1] + prev[k];
            }
            next[next.length - 1] = 2;
            prev = next;
            }
        }
        }
            /*
             * 
             */
        public void figuraNº19While(int filas){
        int [] prev = {2};
        int r = 1;
        while (r <= filas) {
            int d = 0;
            while (d < prev.length) {
                if (d == 0) {
                    System.out.print("*");
                } else if (d == prev.length - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(prev[d]);
                }
                System.out.println();
            int[] next = new int[prev.length + 1];
            next[0] = 1;
            int k = 1;
            while (k <= prev.length - 1) {
                next[k] = prev[k - 1] + prev[k];
                k++;
            }
            next[next.length - 1] = 2;
            prev = next;
            }
            r++;
        }
        }
        /*
         * 
         */
        public void figuraNº19DoWhile(int filas){
        int [] prev = {2};
        int r = 1;
        do {
            int d = 0;
            do {
                if (d == 0) {
                    System.out.print("*");
                } else if (d == prev.length - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(prev[d]);
                }
                System.out.println();
            int[] next = new int[prev.length + 1];
            next[0] = 1;
            int k = 1;
            do {
                next[k] = prev[k - 1] + prev[k];
                k++;
            } while (k <= prev.length - 1);
            next[next.length - 1] = 2;
            prev = next;
            d++;
            } while (d < prev.length);
            r++;
        } while (r <= filas);
        }



}
