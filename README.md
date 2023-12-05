# Kotlin-Menu_Button
#  
#  
### 생성 방법
#### 1. res폴더 우클릭 -> Android Resource Directory -> menu type 으로 생성
#### 2. 생성한 menu 폴더 우클릭 -> New -> Menu Resource File 생성
#### 3. Menu / Items 들 꾸미기 ( xml 파일 )
#### 4. Activity 파일에 Menu Create 와 ItemSelected 함수로 기능 설정하기 ( 아래 코드 참고 )
#  
#  
## 1. Create Menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.option, menu)
        return super.onCreateOptionsMenu(menu)
    }
#  
#  
## 2. ItemSelected
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.home -> Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show()
            R.id.information -> Toast.makeText(this, "Information", Toast.LENGTH_SHORT).show()
            R.id.setting -> Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
