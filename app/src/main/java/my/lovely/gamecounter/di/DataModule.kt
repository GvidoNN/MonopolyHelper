package my.lovely.gamecounter.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import my.lovely.gamecounter.data.repository.BalanceRepositoryImpl
import my.lovely.gamecounter.domain.repository.BalanceRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataModule {

    @Provides
    @Singleton
    fun provideBalanceRepositoryImpl(): BalanceRepository {
        return BalanceRepositoryImpl()
    }

}