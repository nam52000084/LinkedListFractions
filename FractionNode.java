public class FractionNode
{
        private int numerator;
        private int denominator;

        public FractionNode()
        {
                this.numerator=0;
                this.denominator=1;
        }

        public FractionNode(int num, int den)
        {

                if (den == 0)
                {
                        throw new IllegalArgumentException("The denominator is zero!");
                }
                else
                {
                        this.denominator=den;
                        this.numerator=num;
                }

        }

        public int getNumerator()
        {
                return this.numerator;
        }
        public int getDenominator()
        {
                return this.denominator;
        }
        public void setDenominator(int denominator)
        {
                this.denominator=denominator;
        }
        public void setNumerator(int numerator)
        {
                this.numerator=numerator;
        }

        public String toString()
        {
                return numerator+"/"+denominator;
        }
}
