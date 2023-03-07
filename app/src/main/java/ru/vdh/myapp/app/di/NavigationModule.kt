package ru.vdh.myapp.app.di

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import dagger.Lazy
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import ru.vdh.myapp.R
import ru.vdh.myapp.app.navigation.AppNewFeatureDestinationToUiMapper
import ru.vdh.myapp.app.navigation.AppSecondFeatureDestinationToUiMapper
import ru.vdh.myapp.navigation.mapper.GlobalDestinationToUiMapper
import ru.vdh.myapp.newfeature.ui.mapper.NewFeatureDestinationToUiMapper
import ru.vdh.myapp.secondfeature.ui.mapper.SecondFeatureDestinationToUiMapper

@Module
@InstallIn(ActivityComponent::class)
class NavigationModule {
    @Provides
    fun providesSupportFragmentManager(activity: Activity) =
        (activity as AppCompatActivity).supportFragmentManager

    @Provides
    fun providesNavHostFragment(fragmentManager: FragmentManager) =
        fragmentManager.findFragmentById(R.id.nav_host_fragment_content_main) as NavHostFragment

    @Provides
    fun providesNavController(navHostFragment: NavHostFragment) =
        navHostFragment.navController

    @Provides
    fun providesGlobalDestinationToUiMapper(
        lazyNavController: Lazy<NavController>
    ) = GlobalDestinationToUiMapper(lazyNavController)

    @Provides
    fun providesAppNewFeatureDestinationToUiMapper(
        activity: FragmentActivity,
        globalDestinationToUiMapper: GlobalDestinationToUiMapper
    ): NewFeatureDestinationToUiMapper =
        AppNewFeatureDestinationToUiMapper(activity, globalDestinationToUiMapper)

    @Provides
    fun providesAppSecondFeatureDestinationToUiMapper(
        activity: FragmentActivity,
        globalDestinationToUiMapper: GlobalDestinationToUiMapper
    ): SecondFeatureDestinationToUiMapper =
        AppSecondFeatureDestinationToUiMapper(activity, globalDestinationToUiMapper)
}
