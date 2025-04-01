using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BFSAI
{
    class Program
    {
        static void Main(string[] args)
        {
            //Đọc và in ma trận
            DoThi dt = new DoThi();
            dt.DocDoThi();
            dt.InDoThi();

            /*List<int> danhSachKe = dt.succs(dt.Start);
            Console.WriteLine("\nDanh sach cac dinh ke " + dt.Start + ":");
            foreach (var dinh in danhSachKe)
            {
                Console.Write(dinh + " ");
            }
            Console.WriteLine();*/

            //Test ket qua cua bfs
            BFSAI bfs = new BFSAI();
            bfs.timKiemBFS();
            bfs.InDuongDi();

            Console.ReadLine();
        }
    }
}
