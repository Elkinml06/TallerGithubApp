package me.elkinmendoza.tallergithub

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.elkinmendoza.tallergithub.ui.theme.TallerGithubAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            presentacion()
        }
    }
}

@Preview(showBackground = true,
    showSystemUi = true)
@Composable
fun presentacion() {
    Column(

        modifier = Modifier
            .fillMaxSize().padding(25.dp)
        ,

        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val painter = painterResource(id = R.drawable.person)
        Image(
            painter = painter,
            contentDescription =null,
            modifier = Modifier
                .size(200.dp)
                .clip(CircleShape)
                .border(3.dp, Color(0xFF2F80ED), CircleShape)
                .fillMaxWidth()

        )

        Text(
            text = "Elkin Mendoza",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp)
        )
        Text(
            text = "Desarrollador Móvil Senior",
            color = Color.Blue,
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 5.dp)
        )
        HorizontalDivider(
            thickness = 1.dp,
            color = Color.Gray,
            modifier = Modifier.padding(25.dp,35.dp,25.dp,15.dp)
        )
        Text(
            text = "EDAD",
            fontSize = 20.sp,
            color = Color.Gray,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(25.dp,0.dp)
        )
        Text(
            text = "20 años",
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(25.dp,0.dp)
        )
        Text(
            text = "CORREO",
            fontSize = 20.sp,
            color = Color.Gray,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(25.dp,15.dp,25.dp,0.dp)
        )
        Text(
            text = "[emendoza264@unab.edu.co]",
            color = Color.Blue,
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(25.dp,0.dp)
        )
        Text(
            text = "CIUDAD",
            fontSize = 20.sp,
            color = Color.Gray,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(25.dp,15.dp,25.dp,0.dp)
        )
        Text(
            text = "Bucaramanga, Colombia",
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(25.dp,0.dp)
        )
        HorizontalDivider(
            thickness = 1.dp,
            color = Color.Gray,
            modifier = Modifier.padding(25.dp,25.dp,25.dp,15.dp)
        )
        Text(
            text = "SOBRE MI MATERIA FAVORITA",
            fontSize = 20.sp,
            color = Color.Gray,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp)
        )
        Text(
            text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(25.dp,0.dp)
        )
        Button(
            modifier = Modifier
                .padding(25.dp, 30.dp)
                .fillMaxWidth(),
            onClick = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue,
                contentColor = Color.White
            )
        ) {
            Text("Contactar conmigo")
        }



    }
}
