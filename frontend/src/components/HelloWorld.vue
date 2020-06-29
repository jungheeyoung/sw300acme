<template>
  <v-container>
    <!--<v-navigation-drawer fixed v-model="drawerRight" left clipped app ></v-navigation-drawer>-->
    <v-layout
      text-xs-center
      wrap
    >
      <v-flex mb-4>
        <h1 class="display-2 font-weight-bold mb-3">
            안녕하세요, ASA입니다.
        </h1>
        <p class="subheading font-weight-regular">
          ASA란?
          <br>Ar Structure Assistant 의 약자로 건축 현장의 마크를 인식하여 해당 건물의 완공된 상태를 3D모델로 전시합니다.
          <br>
          네비웍스 sw 300 신입사원 교육 과정의 캡스톤 프로젝트 결과물입니다.
        </p>
      </v-flex>

      <v-flex
        mb-5
        xs12
      >
        <h2 class="headline font-weight-bold mb-3">HOME 메뉴</h2>
        <v-layout justify-center>
          메인 화면으로 ASA 서비스를 방문했을 시 전시되는 첫 번째 페이지입니다.
        </v-layout>
      </v-flex>

      <v-flex
        xs12
        mb-5
      >
        <h2 class="headline font-weight-bold mb-3">ArPage</h2>
        <v-layout justify-center>
          ASA 서비스의 주력 콘텐츠로 건축 현장의 마크를 인식하여 해당 건물의 완공된 상태를 3D모델로 전시합니다.
        </v-layout>
      </v-flex>

      <v-flex
        xs12
        mb-5
      >
        <h2 class="headline font-weight-bold mb-3">Map</h2>
        <v-layout justify-center>
          ASA 서비스가 설치된 지역을 지도 상에 포인트로 표기합니다. 또한, 해당 지역에 상세 정보를 전시합니다.
        </v-layout>
      </v-flex>
    </v-layout>
  </v-container>
</template>

<script>
  export default {
    data: () => ({
      ecosystem: [
        {
          text: 'vuetify-loader',
          href: 'https://github.com/vuetifyjs/vuetify-loader'
        },
        {
          text: 'github',
          href: 'https://github.com/vuetifyjs/vuetify'
        },
        {
          text: 'awesome-vuetify',
          href: 'https://github.com/vuetifyjs/awesome-vuetify'
        }
      ],
      importantLinks: [
        {
          text: 'Documentation',
          href: 'https://vuetifyjs.com'
        },
        {
          text: 'Chat',
          href: 'https://community.vuetifyjs.com'
        },
        {
          text: 'Made with Vuetify',
          href: 'https://madewithvuetifyjs.com'
        },
        {
          text: 'Twitter',
          href: 'https://twitter.com/vuetifyjs'
        },
        {
          text: 'Articles',
          href: 'https://medium.com/vuetify'
        }
      ],
      whatsNext: [
        {
          text: 'Explore components',
          href: 'https://vuetifyjs.com/components/api-explorer'
        },
        {
          text: 'Select a layout',
          href: 'https://vuetifyjs.com/layout/pre-defined'
        },
        {
          text: 'Frequently Asked Questions',
          href: 'https://vuetifyjs.com/getting-started/frequently-asked-questions'
        }
      ]
    })
  }
</script>

<style>

</style>
