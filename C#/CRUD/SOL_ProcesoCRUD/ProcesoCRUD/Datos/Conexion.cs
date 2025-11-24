using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProcesoCRUD.Datos
{
    internal class Conexion
    {
        private string Base;
        private string Servidor;
        private string Usuario;
        private string Clave;
        private static Conexion con = null;

        private Conexion()
        {
            this.Base = "DB_CRUD";
            this.Servidor = "JESUS-SOLINDATA\\SQLEXPRESS";
            this.Usuario = "user_js";
            this.Clave = "soporte";

        }

        public SqlConnection CrearConexion()
        {
            SqlConnection Cadena = new SqlConnection();
            try
            {
                Cadena.ConnectionString = "Server=" + this.Servidor +
                    "; Database=" + this.Base + ";User Id=" + this.Usuario +
                    ";Password=" + this.Clave + ";";
            }
            catch (Exception ex)
            {
                Cadena = null;
                throw ex;
            }
            return Cadena;
        }

        public static Conexion getInstancia()
        {
            if (con == null)
            {
                con = new Conexion();
            }
            return con;

        }
    }
}
