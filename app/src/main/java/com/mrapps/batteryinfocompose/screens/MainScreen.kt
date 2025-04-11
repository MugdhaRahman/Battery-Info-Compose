package com.mrapps.batteryinfocompose.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.mrapps.batteryinfocompose.R
import com.mrapps.batteryinfocompose.navigation.graphs.SetupNavGraph
import com.mrapps.batteryinfocompose.navigation.screens.HomeScreenObjects
import com.mrapps.batteryinfocompose.ui.theme.colorPrimary

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {

    val navController = rememberNavController()

    rememberSaveable {
        mutableIntStateOf(0)
    }


    Scaffold(
        topBar = {
            Box {
                TopAppBar(
                    title = {
                        Text(
                            text = "Battery Info",
                            style = MaterialTheme.typography.titleLarge
                        )
                    },
                    actions = {
                        Icon(
                            imageVector = Icons.Outlined.Settings,
                            contentDescription = "Profile",
                            modifier = Modifier.padding(end = 16.dp)
                        )
                    },
                    modifier = Modifier
                        .padding(bottom = 10.dp)
                        .fillMaxWidth()
                        .shadow(elevation = 4.dp)

                )
            }
        },

//        floatingActionButton = {
//
//            FloatingActionButton(onClick = {
//
//            }) {
//                Icon(
//                    imageVector = Icons.Filled.Add,
//                    contentDescription = "",
//                    modifier = Modifier.padding(start = 16.dp)
//                )
//            }
//
//        },


        bottomBar = {

            BottomBar(navController = navController)

        }) { innerPadding ->

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            SetupNavGraph(navController = navController)
        }

    }


}

@Composable
fun BottomBar(navController: NavHostController) {
    val screens = listOf(
        HomeScreenObjects.Home1,
        HomeScreenObjects.Home2,
    )

    val navigationItems = listOf(
        NavigationItem(
            title = "Home",
            iconResId = R.drawable.ic_nav_home
        ),
        NavigationItem(
            title = "Monitor",
            iconResId = R.drawable.ic_nav_monitor
        )
    )

    NavigationBar(
        containerColor = Color.White,
        modifier = Modifier.shadow(elevation = 4.dp)
    ) {
        screens.forEachIndexed { index, screen ->
            NavigationBarItem(
                label = {
                    Text(
                        text = navigationItems[index].title, color = colorPrimary
                    )
                },
                icon = {
                    Icon(
                        painter = painterResource(id = navigationItems[index].iconResId),
                        contentDescription = "Navigation Icon",
                        tint = colorPrimary
                    )
                },
                selected = false, // You might want to handle the selected state dynamically
                onClick = {
                    navController.navigate(screen) {
                        popUpTo(navController.graph.findStartDestination().id)
                        launchSingleTop = true
                    }
                }
            )
        }
    }
}

data class NavigationItem(
    val title: String,
    val iconResId: Int
)


@Preview
@Composable
fun PreviewHomeScreen() {
    MainScreen()

}