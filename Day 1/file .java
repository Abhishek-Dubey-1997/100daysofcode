 static int MaximumPossible(int num, int digit)
        {
            
            if (num == 0)
            {
                return digit * 10;
            }

           
            int negative = num / Math.Abs(num);
            
            num = Math.Abs(num);
            int n = num;
           
            int maxVal = int.MinValue;
            int counter = 0;
            int position = 1;

         
            while (n > 0)
            {
                counter++;
                n = n / 10;
            }

      
            for (int i = 0; i <= counter; i++)
            {
                int newVal = ((num / position) * (position * 10)) + (digit * position) + (num % position);

                // if new value is greater the maxVal
                if (newVal * negative > maxVal)
                {
                    maxVal = newVal * negative;
                }

                position = position * 10;
            }

            return maxVal;
        }
    
