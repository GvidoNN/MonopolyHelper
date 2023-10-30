package my.lovely.gamecounter.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import my.lovely.gamecounter.domain.repository.BalanceRepository
import my.lovely.gamecounter.domain.usecase.ChangeBalanceUseCase

@Module
@InstallIn(ViewModelComponent::class)
class DomainModule {

    @Provides
    fun provideCatalogUseCase(balanceRepository: BalanceRepository): ChangeBalanceUseCase {
        return ChangeBalanceUseCase(balanceRepository = balanceRepository)
    }

}
