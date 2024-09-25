package com.example.lab5

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun EmergencyContact(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Emergency Contacts",
            fontSize = 16.sp
        )
        Card(
            modifier = Modifier
                .fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFFFEBEE))
        ) {
            Column(
                modifier = Modifier.padding(12.dp)
            ) {
                Text("🚨 Emergencias", fontSize = 12.sp, color = Color.Red)
                Text("Si se presenta un incidente o un percance, favor marcar el número de emergencia y te apoyamos rápidamente.", fontSize = 8.sp)
                Button(
                    onClick = { /* Acción para llamar */ },
                    modifier = Modifier
                        .fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.LightGray,
                        contentColor = Color.Black
                    )
                ) {
                    Text("Call 5978-1736")
                }
            }
        }

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFE8F5E9))
        ) {
            Column(
                modifier = Modifier.padding(10.dp)
            ) {
                Text("🏥 Clínica UVG", fontSize = 12.sp)
                Text(
                    """
                    La Clínica UVG presta los siguientes servicios:
                    - Atención a Emergencias
                    - Atención Primaria a Enfermedades Comunes
                    - Plan Educacional sobre Enfermedades
                    
                    Horario de Atención: 7:00 a.m. a 8:30 p.m.
                    """.trimIndent(), fontSize = 8.sp
                )
                Button(
                    onClick = { /* Acción para llamar */ },
                    modifier = Modifier
                        .fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.LightGray,
                        contentColor = Color.Black
                    )
                ) {
                    Text("Call 2507-1500 ext 21312")
                }
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = { navController.navigate("profile_screen") },
            shape = RectangleShape,
            modifier = Modifier
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.LightGray,
                contentColor = Color.Black
            )
        ) {
            Text("Regresar a mi perfil")
        }
    }
}

