package com.example.secciones


import com.example.dependencias.R

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

var List = mutableListOf<String>("Seccion1","Seccion2","Seccion3")

@Composable
@Preview
fun SeccionesListarPrincipal(modifier: Modifier=Modifier){
    SeccionesListarContent(modifier)
}


@Composable
private fun SeccionesListarContent(modifier: Modifier=Modifier)
{
    Column {
        HorizontalDivider()
        Row {

            TopBarWithMenuIcon( )
        }
        HorizontalDivider()
        Box(
            modifier = Modifier.fillMaxSize(),

            )
        {
            Box(
                modifier.padding(vertical = 6.dp)
            )
            {
                ItemList(List)
            }
            FloatingActionButton(
                onClick = { },
                modifier = Modifier.align(Alignment.BottomEnd).padding(16.dp),
                containerColor = Color.Black,
                contentColor = Color.White,
            ) {
                Icon(Icons.Filled.Add,"Añadir Dependencia")
            }
        }

    }
}

@Composable
fun ItemList(items: List<String>) {
    LazyColumn(
        modifier = Modifier.padding(horizontal = 16.dp)
    ) {
        items(10) { item ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(
                        width = 1.dp,
                        color = Color.Black,
                        shape = RoundedCornerShape(4.dp)
                    )
                    .padding(16.dp)
            ) {
                Text(
                    text = "Hola",
                    fontSize = 14.sp,
                    modifier = Modifier
                        .weight(1f) // Empuja el resto del contenido hacia la derecha
                        .align(Alignment.CenterVertically)
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        text = "10 productos",
                        fontSize = 14.sp,
                        modifier = Modifier.padding(end = 2.dp)
                    )
                    IconButton(
                        onClick = {  }
                    ) {
                        Icon(
                            imageVector = Icons.Default.MoreVert,
                            contentDescription = "Editar"
                        )
                    }
                }
            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarWithMenuIcon(modifier: Modifier=Modifier) {
    TopAppBar(
        title = {   Text(
            text = "Secciones",
            fontSize = 20.sp,
        ) },
        navigationIcon = {

            Icon(
                imageVector = Icons.Default.Menu,
                contentDescription = "Menú"
            )
        },
        actions =
        {
            IconButton(
                onClick = { }
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.filter),
                    contentDescription = "Filtrar"
                )
            }
            IconButton(
                onClick = { }
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.sort),
                    contentDescription = "Ordenar"
                )
            }
        }
    )
}