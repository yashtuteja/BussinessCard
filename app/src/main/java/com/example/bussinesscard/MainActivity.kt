package com.example.bussinesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bussinesscard.ui.theme.BussinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BussinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
               BussinessCardApp( )
                }
            }
        }
    }
}

@Composable
fun BussinessCard( modifier: Modifier = Modifier) {

}


@Composable
fun CardContent(Title:String,Contact:String,Mail:String,FullName:String,modifier: Modifier=Modifier, backgroundColor:Color,logocolor:Color) {
    val logo = R.drawable.android_logo
    val call = R.drawable.computer_icons_call_icon_773ff09d5a7320a8ce4f35e67617588f
    val mail = R.drawable.email_logo_icon_email_png_dd3fc13c3c3d6e6d110176ae0d6aa42a


    Column (
        modifier=modifier
            .background(backgroundColor)
    ){


        Column(
            modifier = modifier
                .fillMaxSize()


                .padding(top = 10.dp),



            horizontalAlignment = Alignment.CenterHorizontally,
        ) {


            Image(
                painter = painterResource(id = logo),
                contentDescription = null,
                Modifier
                    .padding(start = 100.dp, top = 70.dp, end = 100.dp, bottom = 10.dp)
                    .background(logocolor)

            )
            Column(
                modifier = modifier
                    .fillMaxSize()

                    .padding(10.dp),

                horizontalAlignment = Alignment.CenterHorizontally,
            ) {


                Text(
                    text = Title,
                    fontSize = 40.sp,
                    textAlign = TextAlign.Justify

                )
                Text(
                    text = FullName,
                    fontSize = 18.sp,
                    textAlign = TextAlign.Justify,


                    )

     Row ( modifier = modifier
         .fillMaxSize()
         , verticalAlignment =  Alignment.CenterVertically){




         Column(
             modifier = modifier
                 .fillMaxSize()
                 .padding(start = 1.dp, top = 200.dp),

             horizontalAlignment = Alignment.CenterHorizontally
         ) {
             Row {

                 Column {


                     Column(
                         modifier = modifier
                             .size(width = 50.dp, height = 50.dp)

                     ) {


                         Image(
                             painter = painterResource(id = call),
                             contentDescription = null,
                             Modifier
                                 .padding(start = 1.dp, top = 1.dp, end = 5.dp, bottom = 1.dp)


                         )

                     }
                     Column(
                         modifier = modifier
                             .size(width = 50.dp, height = 50.dp)

                     ) {
                         Image(
                             painter = painterResource(id = mail),
                             contentDescription = null,
                             Modifier
                                 .padding(start = 1.dp, top = 1.dp, end = 5.dp, bottom =1.dp)


                         )
                     }
                 }


                 Column {


                     Text(
                         text = Contact,
                         fontSize = 37.sp,
                         textAlign = TextAlign.Justify

                     )
                     Text(
                         text = Mail,
                         fontSize =30.sp,
                         textAlign = TextAlign.Justify,


                         )
                 }
             }
         }
     }
            }

        }

            }

        }






















@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BussinessCardTheme() {


    }
}

@Preview(showBackground = true)
@Composable
fun BussinessCardApp()
{
  CardContent(Title = "Yash Tuteja", FullName = "Android Developer from Bow valley collage",
      Contact="+123456789", Mail = "abc@yahoo.com",  backgroundColor = Color(0xFF9796E7), logocolor = Color(0xFF3A3880)
  )

}