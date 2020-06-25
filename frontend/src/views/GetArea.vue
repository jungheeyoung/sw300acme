<template>
  <div>
    <v-expansion-panel>
      <v-expansion-panel-content v-if="response!=null" v-for="(item, idx) in response" :key="idx" class="grey lighten-4">
        <div slot="header">
          <h3>{{ item.areaName }}</h3>
        </div>
        <v-card>
          <v-card-text>
            지역명 : {{ item.areaName }}
            <br>
            지역 소개 : {{ item.areaInfo }}
            <br>
            ASA 서비스 설치 현황 : {{ item.areaCount }}개의 장소에서 운영 중
            <br>
            지역 별칭 : {{ item.ormid }}
            <br>
            <v-btn color="primary" @click="selectArea(idx)">Select</v-btn>
          </v-card-text>
        </v-card>
      </v-expansion-panel-content>
      <v-expansion-panel-content v-for="(item, idx) in tempArray" :key="idx" class="grey lighten-4">
        <div slot="header">
          <h3>{{ item.areaName }}</h3>
        </div>
        <v-card>
          <v-card-text>
            지역명 : {{ item.areaName }}
            <br>
            지역 소개 : {{ item.areaInfo }}
            <br>
            ASA 서비스 설치 현황 : {{ item.areaCount }}개의 장소에서 운영 중
            <br>
            지역 별칭 : {{ item.ormid }}
            <br>
            <v-btn color="primary" @click="selectArea(idx)">Select</v-btn>
          </v-card-text>
        </v-card>
      </v-expansion-panel-content>
      <span v-if="response.length < 0">
        <h3>해당 지역에는 ASA 서비스가 존재하지 않습니다.</h3>
      </span>
    </v-expansion-panel>
  </div>
</template>

<script>
export default {
  name: "GetArea",
  props: {
    selectedArea: null,
    step: 0
  },
  data() {
    return {
      response: [],
      errors: [],
      tempArray: [
        {
          areaName: "동작구",
          areaInfo: "동작구는 서울특별시의 남부에 있는 구이다. 북쪽으로는 한강을 경계로 용산구, 동쪽으로는 서초구, 남쪽으로는 관악구, 서쪽으로는 영등포구와 접한다.",
          ormid: "1254",
          areaCount: "32",
        },
        {
          areaName: "과천",
          areaInfo: "과천시는 대한민국 경기도 중부에 있는 시이다. ",
          ormid: "23341",
          areaCount: "29",
        },
        {
          areaName: "포천시",
          areaInfo: "포천시는 대한민국 경기도의 동북부에 위치하고 있는 시이다. ",
          ormid: "123",
          areaCount: "28",
        }
      ]
    };
  },
  methods: {
    getAreaList() {
      this.$axios
        .get("/areas")
        .then(res => {
          console.log(res.data);
          this.response = res.data._embedded.area;
        })
        .catch(e => this.errors.push(e));
    },
    selectArea(idx) {
      this.$emit("update:selectedArea", this.response[idx]);
      this.$emit("update:step", this.step + 1);
    }
  },
  created() {
    this.getAreaList();
  }
};
</script>

<style scoped>
</style>