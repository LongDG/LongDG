using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BFSAI
{
    class BFSAI
    {
        private DoThi dt;
        private Queue<int> q;
        private Queue<int> q1;
        private int[] previous;
        static readonly int NIL = -5;

        public BFSAI()
        {
            dt = new DoThi();
            q = new Queue<int>();
            previous = new int[dt.SoDinh];

            for(int i=0; i < dt.SoDinh; i++)
            {
                previous[i] = -2;
            }
            previous[dt.Start] = NIL;
            q.Enqueue(dt.Start);
        }
        public void timKiemBFS()
        {
            bool kq = false;
            while(q.Count > 0)
            {
                q1 = new Queue<int>();
                foreach (var i in q)
                {
                    foreach (var j in dt.succs(i))
                    {
                        
                        if(previous[j]==-2)
                        {
                            previous[j] = i;
                            q1.Enqueue(j);
                        }
                    }
                }
                q = q1;
            }
        }
        
        public void InDuongDi()
        {
            if (previous[dt.Goal] == -2)
                Console.WriteLine("KHONG tim duoc duong di");
            else
            {
                int current = dt.Goal;
                System.Console.Write("\nKet qua: ");
                while(current != dt.Start)
                {
                    Console.Write($"{current}<==");
                    current = previous[current];
                }
                Console.Write($"{dt.Start}");
            }
        }
    }
}
