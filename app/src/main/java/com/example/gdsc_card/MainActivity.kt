package com.example.gdsc_card

import android.graphics.Color.parseColor
import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gdsc_card.ui.theme.Gdsc_CardTheme
import com.example.gdsc_card.ui.theme.Purple1

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Gdsc_CardTheme {
                MyScreen()
            }
        }
    }
}

@Composable
fun MyScreen(){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card (
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
                .padding(26.dp),
            backgroundColor = Purple1,
            elevation = 10.dp,
            shape= RoundedCornerShape(30.dp)

        ){
            Column(){
                MyRow1()
                MyRow2()
            }

        }

    }


}

@Composable
fun MyRow1(){
    Row(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
    ){
        Text(
            text="Hii !\nNandini Sahu",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            fontSize = 25.sp
        )

        Spacer(modifier = Modifier.padding(18.dp))

        Image(
            painter = painterResource(id = R.drawable.gdsc_logo),
            contentDescription = "Gdsc logo",

        )


    }
}

@Composable
fun MyRow2(){
    Row(
        verticalAlignment = Alignment.Bottom
    ){
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = "Android logo"
        )

        Text(
            text = "Attending Android Camp\n2024",
            color = Color.Black,
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(16.dp)

        )

    }
}




@Preview(showBackground = true,
showSystemUi = true)
@Composable
fun DefaultPreview() {
    Gdsc_CardTheme {
        MyScreen()
    }
}